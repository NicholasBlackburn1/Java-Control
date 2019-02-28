package com.bluetoothcontrol.clidata;

import org.eclipse.paho.client.mqttv3.IMqttClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import java.util.Random;
import java.util.concurrent.Callable;

public class testdata  {
    /*
    public boolean test = false;
    public static final String TOPIC = "tets";
    private final IMqttClient client;

    // ... private members omitted
    public testdata(IMqttClient client) {
        this.client = client;
    }

    @Override
        public Void call() throws Exception {
            if ( !client.isConnected()) {
                return null;
            }
            MqttMessage msg = testtemp();
            msg.setQos(0);
            msg.setRetained(true);
            client.publish(TOPIC,msg);
            return null;
        }

        private MqttMessage testtemp() {
            Random temp = new Random();
            byte[] payload = String.format("T:%04.2f",temp)
                    .getBytes();
            test=true;
            return new MqttMessage(payload);
        }
        */
    }

