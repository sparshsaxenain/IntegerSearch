package com.prodapt.q1;

public class IntegerSearch extends AbstractSearch{
	public boolean search(ObjList [] obj_list, ObjList obj)
	{
		for (int i=0;i<obj_list.length;i++)
		{
			if(obj_list[i].number == obj.number)
			{
				return true;
			}
		}
		return false;
	}
}
