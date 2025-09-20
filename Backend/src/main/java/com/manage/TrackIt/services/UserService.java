package com.manage.TrackIt.services;

import com.manage.TrackIt.dtos.LoginRequest;
import com.manage.TrackIt.dtos.RegisterRequest;
import com.manage.TrackIt.dtos.Response;
import com.manage.TrackIt.dtos.UserDTO;
import com.manage.TrackIt.models.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}
