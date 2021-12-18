package org.wecancoeit.reviews;

public class Review {

    private Long id;
    private String product;
    private String review;

    public Long getId() {
        return id;
    }

    public Review(long id, String product, String review) {
        this.id=id;
        this.product = product;
        this.review = review;
    }

}
