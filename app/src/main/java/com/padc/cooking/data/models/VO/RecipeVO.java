package com.padc.cooking.data.models.VO;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Su Su Oo on 30-Sep-16.
 */
public class RecipeVO {
    @SerializedName("id")
    int id;

    @SerializedName("recipe_name")
    String recipe_name;

    @SerializedName("image")
    String img;

    @SerializedName("ingredient")
    String ingredient;

    @SerializedName("methods")
    String methods;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecipe_name() {
        return recipe_name;
    }

    public void setRecipe_name(String recipe_name) {
        this.recipe_name = recipe_name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getMethods() {
        return methods;
    }

    public void setMethods(String methods) {
        this.methods = methods;
    }
}
