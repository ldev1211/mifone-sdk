package vn.mitek.midule;

import android.content.Context;

import com.example.mifonelibproj.core.Factory;
import com.example.mifonelibproj.listener.MifoneCoreListener;
import com.example.mifonelibproj.model.other.ConfigMifoneCore;
import com.example.mifonelibproj.model.other.User;

public class FactoryMidule {

    public static void createMifoneCore(Context context, ConfigMifoneCore configMifoneCore, User user){
        Factory.createMifoneCore(context,configMifoneCore,user);
    }

    public static void registerListener(MifoneCoreListener mifoneCoreListener){
        Factory.registerListener(mifoneCoreListener);
    }

    public static void holdCall(){
        Factory.holdCall();
    }
    public static void resumeCall(){
        Factory.resumCall();
    }
    public static String getNumbPhoneCallIn(){
        return Factory.getNumbPhoneCallIn();
    }
    public static void transfer(String numbPhone){
        Factory.transfer(numbPhone);
    }
    public static void configCore(){
        Factory.configCore();
    }

    public static void makeCall(String numberPhone){
        Factory.makeCall(numberPhone);
    }

    public static void cancelCall(){
        Factory.cancelCall();
    }

    public static void acceptCall(){
        Factory.acceptCall();
    }
    public static void declineCall(){
        Factory.declineCall();
    }
    public static void sendDtms(int numb){
        Factory.sendDtms(numb);
    }
}
