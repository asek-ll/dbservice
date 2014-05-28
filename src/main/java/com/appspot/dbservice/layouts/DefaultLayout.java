package com.appspot.dbservice.layouts;

import java.util.ArrayList;

import com.appspot.dbservice.bloks.LoginBlock;
import com.appspot.dbservice.bloks.Block;
import com.appspot.dbservice.bloks.MenuBlock;

public class DefaultLayout extends Layout {

	public DefaultLayout() {
		ArrayList<Block> header = new ArrayList<Block>();
		header.add(new MenuBlock());
		header.add(new LoginBlock());
		regions.put("header", header);
	}

}
