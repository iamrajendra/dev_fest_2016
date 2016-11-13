package com.example.rajendra.devfest.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rajendra on 12/11/16.
 */

public class Movie {


    @SerializedName("Search")
    public List<Search> Search;
    @SerializedName("totalResults")
    public String totalResults;
    @SerializedName("Response")
    public String Response;

    public static class Search {
        @SerializedName("Title")
        public String Title;
        @SerializedName("Year")
        public String Year;
        @SerializedName("imdbID")
        public String imdbID;
        @SerializedName("Type")
        public String Type;

        public String getPoster() {
            return Poster;
        }

        public void setPoster(String poster) {
            Poster = poster;
        }

        public String getType() {
            return Type;
        }

        public void setType(String type) {
            Type = type;
        }

        public String getImdbID() {
            return imdbID;
        }

        public void setImdbID(String imdbID) {
            this.imdbID = imdbID;
        }

        public String getYear() {
            return Year;
        }

        public void setYear(String year) {
            Year = year;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String title) {
            Title = title;
        }

        @SerializedName("Poster")
        public String Poster;

    }

    public List<Movie.Search> getSearch() {
        return Search;
    }

    public void setSearch(List<Movie.Search> search) {
        Search = search;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getResponse() {
        return Response;
    }

    public void setResponse(String response) {
        Response = response;
    }
}
