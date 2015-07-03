package net.madmenyo.triangulation;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import java.util.Random;

public class Triangulation extends ApplicationAdapter {
	SpriteBatch batch;
    OrthographicCamera camera;

    Graph graph;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
        camera = new OrthographicCamera(1280, 720);
        camera.position.set(camera.viewportWidth / 2, camera.viewportHeight / 2, 0);
        camera.update();

        graph = new Graph(createNodes(20));
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(.03f, .05f, .10f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.setProjectionMatrix(camera.combined);
		batch.begin();
		batch.end();

        for (int i = 0; i < graph.getNodes().length; i++)
        {
            Draw.Point(graph.getNodes()[i].getLocation(), camera.combined);

        }
	}

    private Node[] createNodes(int amount)
    {
        Random random = new Random();
        Node[] nodes = new Node[amount];

        for (int i = 0; i < amount; i++)
        {
            nodes[i] = new Node(new Vector2(
                    random.nextFloat() * camera.viewportWidth,
                    random.nextFloat() * camera.viewportHeight));
        }
        return nodes;
    }
}
