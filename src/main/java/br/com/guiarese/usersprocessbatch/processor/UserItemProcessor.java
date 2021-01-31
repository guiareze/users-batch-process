package br.com.guiarese.usersprocessbatch.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import br.com.guiarese.usersprocessbatch.model.User;
import br.com.guiarese.usersprocessbatch.model.dto.UserDTO;

public class UserItemProcessor implements ItemProcessor<UserDTO, User> {
    private static final Logger log = LoggerFactory.getLogger(UserItemProcessor.class);

    @Override
    public User process(UserDTO item) throws Exception {

        log.info("processing user data.....{}", item);

        User transformedUser = new User();
        transformedUser.setEmail(item.getEmail());
        transformedUser.setFirstName(item.getFirstName());
        transformedUser.setLastName(item.getLastName());
        transformedUser.setMobileNumber(item.getMobileNumber());
        return transformedUser;
    }

}