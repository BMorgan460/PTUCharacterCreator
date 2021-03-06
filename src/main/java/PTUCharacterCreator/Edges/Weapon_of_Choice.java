package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Weapon_of_Choice extends Edge {
	{
		name = "Weapon of Choice";
		effect = "Choose a specific weapon type. You gain a +2 Bonus on Opposed Rolls to prevent being disarmed while wielding weapons of your chosen type. If you would be disarmed anyway, you may pay 1 AP to prevent yourself from being Disarmed.";
		prereqs.put("A feature with the [Weapon] tag", 0);
	}
	public Weapon_of_Choice(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return true;
	}
}