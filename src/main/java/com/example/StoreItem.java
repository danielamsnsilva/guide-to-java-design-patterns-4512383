package com.example;

public class StoreItem

{
    private final String name;
    private final Double price;
    private final String shortDescription;
    private final String longDescription;
    private final Integer stockAvailable;
    private final String packagingType;


    public StoreItem(StoreItemBuilder builder){
        this.name = builder.name;
        this.price = builder.price;
        this.shortDescription = builder.shortDescription;
        this.longDescription = builder.longDescription;
        this.stockAvailable = builder.stockAvailable;
        this.packagingType = builder.packagingType;
        if (name == null || price == null) {
            throw new IllegalArgumentException("Name and price must not be null");
        }
    }

    @Override
    public String toString() {
        return "StoreItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", shortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", stockAvailable=" + stockAvailable +
                ", packagingType='" + packagingType + '\'' +
                '}';
    }

    public static class StoreItemBuilder{
        private String name;
        private Double price;
        private String shortDescription;
        private String longDescription;
        private Integer stockAvailable;
        private String packagingType;

        public StoreItemBuilder(){

        }

        public String name(String val){
         this.name = val;
         return this;
        }

        public Double price(Double val){
            this.price = val;
            return this;
        }

        public String shortDescription(String val){
            this.shortDescription = val;
            return this;
        }

        public String longDescription(String val) {
            this.longDescription = val;
            return this;
        }

        public Integer stockAvailable(Integer val){
            this.stockAvailable = val;
            return this;
        }

        public String packagingType(String val){
            this.packagingType = val;
            return this;
        }

        public StoreItem build(){
            return new StoreItem(this);
        }

    }
}
