package io.akwa.traquer.emptrack.listener;


import io.akwa.traquer.emptrack.exception.NicbitException;
import io.akwa.traquer.emptrack.model.ApiResponseModel;

public interface ResetPasswordListener {
    void onResetPasswordResponse(ApiResponseModel response, NicbitException e);

}
