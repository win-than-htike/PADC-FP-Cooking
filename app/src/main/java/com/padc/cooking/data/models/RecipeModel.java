package com.padc.cooking.data.models;

import com.google.gson.reflect.TypeToken;
import com.padc.cooking.data.models.VO.RecipeVO;
import com.padc.cooking.utils.CommonInstances;
import com.padc.cooking.utils.JsonUtils;

import org.json.JSONException;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Phyoe Khant on 9/14/2016.
 */
public class RecipeModel {
    private static final String DUMMY_ARTICLE_LIST = "myanmar.json";

    private static RecipeModel objInstance;

    private List<RecipeVO> mRecipeList;

    public RecipeModel() {
        super();
        mRecipeList = initializeRecipeList();;
    }

    public static RecipeModel getInstance(){
        if(objInstance == null){
            objInstance = new RecipeModel();
        }
        return objInstance;
    }
    private List<RecipeVO> initializeRecipeList() {
        List<RecipeVO> recipeList = new ArrayList<>();

        try {
            String dummyRecipeList = JsonUtils.getInstance().loadDummyData(DUMMY_ARTICLE_LIST);
            Type listType = new TypeToken<List<RecipeVO>>() {
            }.getType();
            recipeList = CommonInstances.getGsonInstance().fromJson(dummyRecipeList, listType);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return recipeList;
    }

    public List<RecipeVO> getArticleList() {
        return mRecipeList;
    }

    public RecipeVO getRecipeById(int id) {
        for (RecipeVO recipe : mRecipeList) {
            if (recipe.getId() == id){
                return recipe;
            }
        }
        return null;
    }
}
