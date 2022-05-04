package com.company;

public class Flood_Fill {

    //733. Flood Fill
    //https://leetcode.com/problems/flood-fill/

    /*
     vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int newColor) {

        if (image[sr][sc] == newColor) return image;

        int initial_color= image[sr][sc];

        dfs( image,initial_color, sr,sc,newColor);

        return image;

    }

    void dfs( vector<vector<int>>& image, int init_color,int sr, int sc, int newColor){
        if(sr>=0 && sc>=0 && sr<image.size() && sc< image[0].size() && image[sr][sc]==init_color){
            image[sr][sc]=newColor;

            dfs(image, init_color, sr+1, sc, newColor);
            dfs(image, init_color, sr, sc+1, newColor);
            dfs(image, init_color, sr-1, sc, newColor);
            dfs(image, init_color, sr, sc-1, newColor);
        }
    }
     */
}
