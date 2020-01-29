/*
package controllers;
import models.Book;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;


*/
/**
 * Created by azeem on 4/30/2017.
 *//*


import views.html.books.*;
import views.html.errors.*;

import javax.inject.Inject;

public class BooksController  extends Controller{

    @Inject
    FormFactory formFactory;

    // for all books

    public Result index(){
        List<Book> books = Book.find.all();
        return ok(index.render(books));
    }

    // to create book

    public Result create(){
        Form<Book> bookForm = formFactory.form(Book.class);
        return ok(create.render(bookForm));
    }

    // to save book

    public Result save(){
        Form<Book> bookForm = formFactory.form(Book.class).bindFromRequest();
        if(bookForm.hasErrors()){
            flash("danger","Please Correct the Form Below");
            return badRequest(create.render(bookForm));
        }
        Book book = bookForm.get();
        book.save();
        flash("success","Book Save Successfully");
        return redirect(routes.BooksController.index());
    }

    public Result edit(Integer id){

        Book book = Book.find.byId(id);
        if(book==null){
            return notFound(_404.render());
        }
        Form<Book> bookForm = formFactory.form(Book.class).fill(book);
        return ok(edit.render(bookForm));
    }

    public Result update(){

        Form<Book> bookForm = formFactory.form(Book.class).bindFromRequest();

        if (bookForm.hasErrors()){
            flash("danger","Please Correct the Form Below");
            return badRequest();
        }

        Book book = bookForm.get();
        Book oldBook = Book.find.byId(book.id);
        if(oldBook ==null){
            flash("danger","Book Not Found");
            return notFound();
        }
        oldBook.title = book.title;
        oldBook.author = book.author;
        oldBook.price = book.price;
        oldBook.update();
        flash("success","Book Updated Successfully");
        return ok();
    }

    public Result show(Integer id){
        Book book = Book.find.byId(id);
        if(book==null){
            return notFound(_404.render());
        }
        return ok(show.render(book));
    }

    public Result destroy(Integer id){

        Book book = Book.find.byId(id);
        if(book == null){
            flash("danger","Book Not Found");
            return notFound();
        }
        book.delete();
        flash("success","Book Deleted Successfully");

        return ok();
    }

}
*/
package controllers;

import models.Book;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;

import play.mvc.Http;
import play.mvc.Result;
import views.html.books.*;
import views.html.books.index;

import javax.inject.Inject;
import java.util.Set;

public class BooksController extends Controller {

    @Inject
    FormFactory formFactory;//To create a form we need form factory
    public Result index() {
        Set<Book> books= Book.allBooks();


        return ok(index.render(books));

    }

    public Result create() {
        Form<Book> bookForm=formFactory.form(Book.class);
        return ok(create.render(bookForm));
    }
    // to save book

    public Result save() {

      Form<Book> bookForm = formFactory.form(Book.class).bindFromRequest();//.bindFromRequest();

        Book book = bookForm.get();
        Book.add(book);
        return redirect(routes.BooksController.index());

    }

    public Result edit(Integer id) {
        Book book=Book.findById(id);
        if(book==null){
            return notFound("Book Not Found");
        }
        Form<Book> bookForm=formFactory.form(Book.class).fill(book);

        return ok(edit.render(bookForm));
    }

    public Result update() {
        Book book = formFactory.form(Book.class).bindFromRequest().get();
        Book oldBook = Book.findById(book.id);
        if(oldBook==null) {
            return notFound("Book not found");
        }
        oldBook.title=book.title;
        oldBook.author=book.author;
        oldBook.price=book.price;
        return redirect(routes.BooksController.index());
    }

    public Result show(Integer id) {
        Book book=Book.findById(id);
        if(book==null) {
            return notFound("Book is not found");
        }
        return ok(show.render(book));
        // return ok("akhdfka");
    }

    public Result destroy(Integer id) {
     /*  Book book=Book.findById(id);
        if(book==null){
            return notFound("Book Not Found");
        }
        Book.remove(book);
        return redirect(routes.BooksController.index());*/
    /*    Book book = Book.findById(id);
        if(book == null){
            flash("danger","Book Not Found");
            return notFound();
        }

        book.delete();
        flash("success","Book Deleted Successfully");

        return ok();*/
    return ok("Deleted Successfully");
    }
}