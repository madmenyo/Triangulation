package net.madmenyo.triangulation;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

public class Triangulation extends ApplicationAdapter {
	SpriteBatch batch;
    OrthographicCamera camera;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
        camera = new OrthographicCamera(1280, 720);
        camera.position.set(camera.viewportWidth / 2, camera.viewportHeight / 2, 0);
        camera.update();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(.03f, .05f, .10f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.setProjectionMatrix(camera.combined);
		batch.begin();
		batch.end();
	}
}
