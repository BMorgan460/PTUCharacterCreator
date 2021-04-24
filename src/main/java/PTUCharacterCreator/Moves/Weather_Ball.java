package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Weather_Ball extends Move {
	{
		name = "Weather Ball";
		effect = "If it is Sunny, Weather Ball is Fire-Type. If it is Rainy, Weather Ball is Water-Type. If it is Hailing, Weather Ball is Ice-Type. If it is Sandstorming, Weather Ball is Rock-Type. When a weather effect is on the field, Weather Ball has a Damage Base of 10 (3d8+10 / 24). If there are multiple Weather Effects on the field, choose one type for Weather Ball to be that corresponds with an existing Weather Effect.";
		damageBase = 5;
		AC = 2;
		frequency = "EOT";
		range = "8, 1 Target";
		type = "Normal";
		category = "Special";
	}
	public Weather_Ball(){}
}