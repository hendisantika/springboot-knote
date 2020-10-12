package com.hendisantika.knote.repository;

import com.hendisantika.knote.entity.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : knote
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/10/20
 * Time: 05.53
 */
public interface NotesRepository extends MongoRepository<Note, String> {
}
