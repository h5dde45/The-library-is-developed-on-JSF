package ru.javabegin.training.web.controllers;

import ru.javabegin.training.web.enums.SearchType;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

@ManagedBean
@RequestScoped
public class SearchTypeController {

    private Map<String, SearchType> searchList = new HashMap<>(); // хранит все виды поисков (по автору, по названию)

    public SearchTypeController() {

        ResourceBundle bundle = ResourceBundle.getBundle("ru.javabegin.training.web.nls.messages", FacesContext.getCurrentInstance().getViewRoot().getLocale());
        searchList.put(bundle.getString("author_name"), SearchType.AUTHOR);
        searchList.put(bundle.getString("book_name"), SearchType.TITLE);
    }

    public Map<String, SearchType> getSearchList() {
        return searchList;
    }
}
