package com.bionic_app.classes.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Category {

    public Category(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Category(String id, String name, String description)
    {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    private String id;
    private String name;
    private String description;
    private Category parentCategory = null;
    private List<Category> childCategories = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getParent() {
        return parentCategory;
    }

    private void setParent(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public List<Category> getChildren() {
        return this.childCategories;
    }

    public Optional<Category> getChild(String id) {
        return this.childCategories.
                stream().
                filter(c -> c.getId().equals(id)).
                findFirst();
    }

    public void addChild(Category category) {
        category.setParent(this);
        this.childCategories.add(category);
    }
}
