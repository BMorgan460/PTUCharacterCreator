package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Relic_Song extends Move {
	{
		name = "Relic Song";
		effect = "All legal targets fall Asleep on 16+. As long as Meloetta knows Relic Song, it may change between Aria Form and Step Form as a Swift Action when using Relic Song or as a Standard Action otherwise. Both Aria and Step Form must be statted with the same HP Stat.";
		damageBase = 8;
		mDamageBase = 8;
		AC = 2;
		frequency = "Scene";
		range = "Burst 3, Friendly, Sonic";
		type = "Normal";
		category = "Special";
	}
	public Relic_Song(){}
}