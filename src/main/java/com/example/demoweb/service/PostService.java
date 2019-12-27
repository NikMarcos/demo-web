package com.example.demoweb.service;
import com.example.demoweb.models.Post;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts() {
        Date date = new Date();
        String strDateFormat = "EEE, MMM d, ''yy";
        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
        String formattedDate= dateFormat.format(date);

        List<Post> result = new ArrayList<>();
        result.add(new Post("presenting voluptatum deleniti atque corrupti in culpa qui officia deserunt mollitia" +
                " animi, id est laborum et dolorum fuga. est et expedita distinctio", dateFormat.format(date)));
        result.add(new Post("Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil Temporibus autem" +
                " quibusdam et aut officiis debitis aut rerum necessitatibus saepe", dateFormat.format(date)));
        result.add(new Post("eveniet ut et voluptates repudiandae sint et molestiae non recusandae. maiores alias" +
                " consequatur aut perferendis doloribus asperiores repellat", dateFormat.format(date)));
        return result;

    };
}
