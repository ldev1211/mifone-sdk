package vn.mitek.mifone_sdk.listener;

import vn.mitek.mifone_sdk.model.RegistrationState;
import vn.mitek.mifone_sdk.model.State;

public interface MifoneCoreListener {
    public void onResultConfigAccount(boolean isSuccess,String message);
    public void onCallStateChanged(State state, String message);
    public void onRegistrationStateChanged(RegistrationState state, String message);
    public void onError(String message);
    public void onExpiredAccessToken();
    public void onResultConfigProxy(boolean isSuccess);
}
