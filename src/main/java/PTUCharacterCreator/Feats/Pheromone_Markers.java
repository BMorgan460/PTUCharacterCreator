package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Pheromone_Markers extends Feature {
	{
		name = "Pheromone Markers";
		tags = "";
		frequency = "1 AP - Free Action ";
		effect = "Trigger: You hit a foe with a damaging Bug-Type attack Effect: The triggering foe gains 1 Pheromone Stack. Your Bug-Type attacks gain a +2 bonus to Accuracy Rolls and +1 Critical Hit range against foes for each Pheromone Stack they have. Once per Scene per foe, when they gain their third or higher Pheromone Stack, you may choose to roll 1d6. On a result of 1 or 2, the foe becomes Confused, on a result of 3 or 4 the foe becomes Suppressed, on a result of 5 or 6 the foe becomes Enraged.";
		prereqs.put("Enhanced Embrace Rank 1", -1);
	}
	public Pheromone_Markers(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Enhanced Embrace Rank 1");
	}
}