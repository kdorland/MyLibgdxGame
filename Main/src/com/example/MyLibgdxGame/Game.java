package com.example.MyLibgdxGame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public class Game extends com.badlogic.gdx.Game {
    Texture texture;
    SpriteBatch batch;
    OrthographicCamera camera;
    Vector3 spritePosition = new Vector3();

    public void create() {
        batch = new SpriteBatch();
        texture = new Texture(Gdx.files.internal("test.png"));
        camera = new OrthographicCamera();
        camera.setToOrtho(false);
    }

    public void render() {
        Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 0.1f);
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

        // draw the sprite
        batch.begin();
        batch.draw(texture, spritePosition.x, spritePosition.y);
        batch.end();

        // if a finger is down, set the sprite's x/y coordinate.
        if (Gdx.input.isTouched()) {
            camera.unproject(spritePosition.set(Gdx.input.getX(), Gdx.input.getY(), 0));
        }
    }
}
