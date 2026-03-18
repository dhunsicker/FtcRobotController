package org.firstinspires.ftc.teamcode;  //


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class HelloWorld_MrH extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello", "World");
        telemetry.addData("Hello2", "World2");
        telemetry.addData("Hello3", "World3");
    }
@Override
    public void loop() {

    }
}