package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

// import model classes
import models.*;

// import views
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    // Declare a private FormFactory instance
    private FormFactory formFactory;

    // Inject an instance of FormFactory into the controller via its constructor
    @Inject
    public HomeController(FormFactory f) {
        this.formFactory = f;
    }    

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index(String name) {
        return ok(index.render("Welcome to the Home page", name));
    }

    public Result about() {
        return ok(about.render());
    }

    public Result products() {

        List<Product> productsList = Product.find.all();

        return ok(products.render(productsList));
    }

    public Result addProduct() {

        // Create a form by wrapping the Product class
        // in a FormFactory form instance
        Form<Product> productForm = formFactory.form(Product.class);
        
        return ok(addProduct.render(productForm));
    }

    public Result updateProduct(Long id) {
        
        Product p;
        Form<Product> productForm;

        try {
            // Find the product by id
            p = Product.find.byId(id);

            // Fill the form object using the product, if found
            productForm = formFactory.form(Product.class).fill(p);

        } catch (Exception ex) {
            // Display an error message
            return badRequest("error");
        }

        // Render the updateProduct view - pass the form as parameter
        return ok(addProduct.render(productForm));
    }

    public Result addProductSubmit() {

        // Retrieve the submitted form object (bind from the HTTP request)
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        // Check for errors (based on constraints set in the Product class)
        if (newProductForm.hasErrors()) {
            // Display the form again by returning a bad request
            return badRequest(addProduct.render(newProductForm));

        } else {
            // No errors found - extract the Product details from the form
            Product newProduct = newProductForm.get();

            // A new, unsaved, product will not have an id
            if (newProduct.getId() == null) {
                // Save to the object to the Products table
                newProduct.save();
            }
            else if (newProduct.getId() != null ) {
                // Product exists
                newProduct.update();
            }

            // Set a success message in flash
            // for display in return view
            flash("success", "Product " + newProduct.getName() + " was added/ updated");

            // Redirect to the products page
            return redirect(controllers.routes.HomeController.products());
        }
    }

    public Result deleteProduct(Long id) {
        
        // find product by id and call delete method
        Product.find.ref(id).delete();

        // Set a success message in flash
        // for display in return view
        flash("success", "Product deleted successfully");
        
        // Redirect to the products page
        return redirect(controllers.routes.HomeController.products());
    }
}
