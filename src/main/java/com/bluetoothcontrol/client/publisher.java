package com.bluetoothcontrol.client;

import com.intel.bluetooth.Utils;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.UUID;

public class publisher {


        public static final String BROKER_URL = "tcp://broker.mqttdashboard.com:1883";
        private MqttClient client;

        InetAddress ip;
        NetworkInterface network = NetworkInterface.getByInetAddress(ip);

        public publisher() throws SocketException {
            byte[] mac = network.getHardwareAddress();
            String clientId = mac+ "-pub";
            try
            {
                client = new MqttClient(BROKER_URL, clientId);
            }
            catch (MqttException e)
            {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }
}
