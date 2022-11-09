package com.example.splitwise.service;

import com.example.splitwise.models.User;
import com.example.splitwise.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;

class UserServiceTest {
    private final UserRepository userRepository = Mockito.mock(UserRepository.class);
    private final UserService userService = new UserService(userRepository);


    @Test
    public void shouldTestAddUser() {
        // given
        User user = Mockito.mock(User.class);

        // when
        userService.addUser(user);

        // then
        Mockito.verify(userRepository, Mockito.times(1)).save(user);
    }

    @Test
    public void shouldReturnUserAfterSaving() {
        User user = Mockito.mock(User.class);
        // stubbing the method calls
        Mockito.when(userRepository.save(user)).thenReturn(user);

        User actual = userService.addUser((user));

        assertEquals(user, actual);
    }

    @Test
    public void shouldHandleNullUserScenario(){
        assertThrows(IllegalArgumentException.class, () -> userService.addUser(null));

        Mockito.verify(userRepository, Mockito.never()).save(any());
    }


}