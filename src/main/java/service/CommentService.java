package service;

import model.Comment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CommentService {
    private final String COMMENTS_API_URL = "https://jsonplaceholder.typicode.com/comments";

    public List<Comment> fetchAllComments() {
        RestTemplate restTemplate = new RestTemplate();
        Comment[] commentsArray = restTemplate.getForObject(COMMENTS_API_URL, Comment[].class);
        return Arrays.asList(commentsArray);
    }
}
