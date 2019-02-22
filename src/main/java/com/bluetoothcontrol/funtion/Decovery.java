package com.bluetoothcontrol.funtion;

import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;

public class Decovery implements DiscoveryListener{
     
        @Override
        public void deviceDiscovered(RemoteDevice btDevice, DeviceClass arg1) {
            String name;
            try {
                name = btDevice.getFriendlyName(false);
            } catch (Exception e) {
                name = btDevice.getBluetoothAddress();
            }
             
            System.out.println("device found: " + name);
             
        }
     
        @Override
        public void inquiryCompleted(int arg0) {
            System.out.print("g");
            }
     
        @Override
        public void serviceSearchCompleted(int arg0, int arg1) {
        }
     
        @Override
        public void servicesDiscovered(int arg0, ServiceRecord[] arg1) {
        }
     
    }
