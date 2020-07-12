package question3;

import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class HashSetFactory<T> implements Factory<Set> {
    public  Set create () {
		return  new  HashSet ();
	}

}