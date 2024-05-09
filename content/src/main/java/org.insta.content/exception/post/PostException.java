package org.insta.content.exception.post;

import org.insta.exception.InstagramException;

/**
 * <p>
 * Exception class for handle Post.
 * </p>
 *
 * @author Mohamed Yasar
 * @version 1.0 6 Feb 2024
 * @see InstagramException
 */
public class PostException extends InstagramException {

    /**
     * <p>
     * Constructs an PostException with the specified detail message.
     * </p>
     *
     * @param message Refers the exception message.
     */
    public PostException(final String message) {
        super(message);
    }
}