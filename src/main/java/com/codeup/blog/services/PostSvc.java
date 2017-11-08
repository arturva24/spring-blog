
package com.codeup.blog.services;

import com.codeup.blog.models.Post;
import com.codeup.blog.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


//@Service("postSvc")
//public class PostSvc {
//    private final PostRepository postsDao;
//    @Autowired
//    public PostSvc(PostRepository postsDao){
//        this.postsDao = postsDao;
////        createDummyPosts();
//    }
//    //type cast the object with the data type you need the .findAll is whats being called from the repository
//    public List<Post> showAllPosts() {
//        return (List<Post>) postsDao.findAll();
//    }
//    public Post findById(long id) {
//        return postsDao.findOne(id);
//    }
//    public Post savePosts(Post post) {
//        postsDao.save(post);
//        return post;
//    }



@Service("postSvc")
public class PostSvc {
    private final PostRepository postsDao;
    @Autowired
    public PostSvc(PostRepository postsDao){
        this.postsDao = postsDao;
//        createDummyPosts();
    }
    //type cast the object with the data type you need the .findAll is whats being called from the repository
    public List<Post> showAllPosts() {
        return (List<Post>) postsDao.findAll();
    }
    public Post findById(long id) {
        return postsDao.findOne(id);
    }
    public Post savePosts(Post post) {
        return postsDao.save(post);
//        postsDao.save(post);
//        return post;
    }

    public void delete(long id) {
        postsDao.delete(id);
    }

    public Iterable<Post> findAll() {
        return postsDao.findAll();
    }
}