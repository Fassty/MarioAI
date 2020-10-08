import java.awt.Graphics;
import agents.controllers.MarioAIBase;
import engine.LevelScene;
import engine.VisualizationComponent;
import engine.input.MarioInput;
import environments.IEnvironment;

// Code your custom agent here!

public class MyAgent extends MarioAIBase {
	@Override
	public void debugDraw(VisualizationComponent vis, LevelScene level,	IEnvironment env, Graphics g) {
		super.debugDraw(vis, level, env, g);
		if (mario == null) return;

		// EXAMPLE DEBUG VISUALIZATION
		String debug = "MY DEBUG STRING";
		VisualizationComponent.drawStringDropShadow(g, debug, 0, 26, 1);
	}

    // Called on each tick to find out what action(s) Mario should take.
	@Override
	public MarioInput actionSelectionAI() {
		// ALWAYS RUN RIGHT
		control.runRight();
		
		// RETURN THE RESULT
		return action;
	}
}
