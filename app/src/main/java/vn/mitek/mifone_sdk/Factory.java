package vn.mitek.mifone_sdk;

import android.content.Context;

import com.example.mifonelibproj.core.FactoryMifone;
import com.example.mifonelibproj.model.other.RegistrationState;
import com.example.mifonelibproj.model.other.State;

import vn.mitek.mifone_sdk.listener.MifoneCoreListener;
import vn.mitek.mifone_sdk.model.ConfigMifoneCore;
import vn.mitek.mifone_sdk.model.User;

public class Factory {

    public static void createMifoneCore(Context context, ConfigMifoneCore configMifoneCore, User user){
        com.example.mifonelibproj.model.other.User user1 = new com.example.mifonelibproj.model.other.User(user.getUsername(),user.getPassword(),user.getType());
        FactoryMifone.createMifoneCore(context,configMifoneCore.getConfigMifoneCore(),user1);
    }

    public static void registerListener(MifoneCoreListener mifoneCoreListener){
        com.example.mifonelibproj.listener.MifoneCoreListener mifoneCoreListenerLib = new com.example.mifonelibproj.listener.MifoneCoreListener() {
            @Override
            public void onResultConfigAccount(boolean isSuccess, String message) {
                mifoneCoreListener.onResultConfigAccount(isSuccess,message);
            }

            @Override
            public void onCallStateChanged(State state, String message) {
                vn.mitek.mifone_sdk.model.State state1 = new vn.mitek.mifone_sdk.model.State(state.toInt());
                mifoneCoreListener.onCallStateChanged(state1,message);
            }

            @Override
            public void onRegistrationStateChanged(RegistrationState state, String message) {
                vn.mitek.mifone_sdk.model.RegistrationState registrationState = new vn.mitek.mifone_sdk.model.RegistrationState(state.toInt());
                mifoneCoreListener.onRegistrationStateChanged(registrationState,message);
            }

            @Override
            public void onError(String message) {
                mifoneCoreListener.onError(message);
            }

            @Override
            public void onExpiredAccessToken() {
                mifoneCoreListener.onExpiredAccessToken();
            }

            @Override
            public void onResultConfigProxy(boolean isSuccess) {
                mifoneCoreListener.onResultConfigProxy(isSuccess);
            }
        };
        FactoryMifone.registerListener(mifoneCoreListenerLib);
    }

    public static void holdCall(){
        FactoryMifone.holdCall();
    }
    public static void resumeCall(){
        FactoryMifone.resumeCall();
    }
    public static String getNumbPhoneCallIn(){
        return Factory.getNumbPhoneCallIn();
    }
    public static void transfer(String numbPhone){
        FactoryMifone.transfer(numbPhone);
    }
    public static void configCore(){
        FactoryMifone.configCore();
    }

    public static void makeCall(String numberPhone){
        FactoryMifone.makeCall(numberPhone);
    }

    public static void cancelCall(){
        FactoryMifone.cancelCall();
    }

    public static void acceptCall(){
        FactoryMifone.acceptCall();
    }
    public static void declineCall(){
        FactoryMifone.declineCall();
    }
    public static void sendDtms(int numb){
        FactoryMifone.sendDtms(numb);
    }
}
