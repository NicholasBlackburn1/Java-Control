package com.bluetoothcontrol.funtion;

import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;

public class Searchclient {
    
    public static void BlueSearch(){
       
        Object lock = new Object();
 
 try{
            // 1
            LocalDevice localDevice = LocalDevice.getLocalDevice();
 
            // 2
            DiscoveryAgent agent = localDevice.getDiscoveryAgent();
             
            // 3
            agent.startInquiry(DiscoveryAgent.GIAC,new Decovery().deviceDiscovered(btDevice, arg1);
 
            try {
                synchronized(lock){
                    lock.wait();
                }
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Device Inquiry Completed. ");
             
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
