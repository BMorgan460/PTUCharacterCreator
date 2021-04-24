package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Capsule_Science extends Feature {
	{
		name = "Capsule Science";
		tags = "[Gadgeteer Research Field] [Branch] [5-15 Playtest]";
		frequency = "Static";
		effect = "You learn the Cap Cannon, Cap Ammo, and Wonder Launcher recipes, and you gain the following additional effects when using those items.  »» Bean Caps: You gain a +10 Damage Bonus when using Bean Caps. »» Glue Caps: Your Effect Range when using Glue Caps is increased by +3. »» Nets Caps: Targets affected by your Net Caps gain a -X penalty to all Damage Rolls, where X is your Technology Education Rank. »» Wonder Launcher: Whenever you apply an item to a target using the Wonder Launcher, they gain Temporary Hit Points equal to your Technology Education Rank.";
		prereqs.put("Improvised Gadgets", -1);
		prereqs.put("Tech Edu", 5);
	}
	public Capsule_Science(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Improvised Gadgets") && t.checkSkillRank("Tech Edu",5);
	}
}