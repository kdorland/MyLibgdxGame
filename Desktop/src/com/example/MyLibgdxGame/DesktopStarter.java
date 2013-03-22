package com.example.MyLibgdxGame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopStarter {
    public static void main(String[] args) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = "RockGame";
        cfg.useGL20 = true;
        cfg.width = 500;
        cfg.height = 700;
        new LwjglApplication(new Game(), cfg);
    }
}