package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;

public class RerviewRepositoryTests {

    private ReviewRepository underTest;
    private Review reviewOne = new Review(1L, "product one name", "review");
    private Review reviewTwo = new Review(2L, "product two name", "review");

    @Test
    public void shouldFindReviewOne() {
        underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findOne(1L);
        assertEquals(reviewOne, foundReview);
    }

    @Test
    public void shouldFindReviewOneAndReviewTwo() {
        underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review> foundReview = underTest.findAll();
        assertThat(foundReview).contains(reviewOne, reviewTwo);
    }
}
