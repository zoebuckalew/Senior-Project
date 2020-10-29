package com.seniorproject.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.seniorproject.enums.CharacterName;

public class PerformerAtlas
{
	private static final String TAG = PerformerAtlas.class.getSimpleName();
	
	private static PerformerAtlas instance;
	
	public static PerformerAtlas getInstance()
	{
		if(instance == null)
		{
			instance = new PerformerAtlas();
		}
		return instance;
	}
	
	private TextureRegion angus;
	private TextureRegion banquo;
	private TextureRegion donalbain;
	private TextureRegion duncan;
	private TextureRegion ladyMacbeth;
	private TextureRegion lennox;
	private TextureRegion macbeth;
	private TextureRegion macduff;
	private TextureRegion malcolm;
	private TextureRegion ross;
	private TextureRegion sergeant;
	private TextureRegion messenger;
	private TextureRegion firstWitch;
	private TextureRegion secondWitch;
	private TextureRegion thirdWitch;
	
	private PerformerAtlas()
	{
		TextureAtlas atlas;
		atlas = new TextureAtlas(Gdx.files.internal("characters/sprites/performer-atlas.atlas"));
		
		Gdx.app.debug(TAG, "Texture Atlas created, contains regions:");
		for(int i = 0; i < atlas.getRegions().size; i++)
		{
			AtlasRegion temp = atlas.getRegions().get(i);
			Gdx.app.debug(TAG, "\t\t" + temp.name + " at coordinates: (" + temp.getRegionX() + ", " + temp.getRegionY() + ")");
		}
		
		this.angus = atlas.findRegion("angus");
		this.banquo = atlas.findRegion("banquo");
		this.donalbain = atlas.findRegion("donalbain");
		this.duncan = atlas.findRegion("duncan");
		this.ladyMacbeth = atlas.findRegion("lady-macbeth");
		this.lennox = atlas.findRegion("lennox");
		this.macbeth = atlas.findRegion("macbeth");
		this.macduff = atlas.findRegion("macduff");
		this.malcolm = atlas.findRegion("malcolm");
		this.ross = atlas.findRegion("ross");
		this.sergeant = atlas.findRegion("sergeant");
		this.messenger = atlas.findRegion("messenger");
		this.firstWitch = atlas.findRegion("first-witch");
		this.secondWitch = atlas.findRegion("second-witch");
		this.thirdWitch = atlas.findRegion("third-witch");
	}
	
	public TextureRegion getPerformerTexture(CharacterName name)
	{
		switch(name)
		{
			case ANGUS:
				return this.angus;
			case BANQUO:
				return this.banquo;
			case DONALBAIN:
				return this.donalbain;
			case DUNCAN:
				return this.duncan;
			case LADY_MACBETH:
				return this.ladyMacbeth;
			case LENNOX:
				return this.lennox;
			case MACBETH:
				return this.macbeth;
			case MACDUFF:
				return this.macduff;
			case MALCOLM:
				return this.malcolm;
			case ROSS:
				return this.ross;
			case SERGEANT:
				return this.sergeant;
			case MESSENGER:
				return this.messenger;
			case FIRST_WITCH:
				return this.firstWitch;
			case SECOND_WITCH:
				return this.secondWitch;
			case THIRD_WITCH:
				return this.thirdWitch;
				default:
					return this.messenger;
		}
	}
}
