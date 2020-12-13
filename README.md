# OrderedArrayList
 We discussed if we were able to still call the parent class add() method in our NoNullArrayList.add() which overwrites it. This makes it so that we don't need to actually rewrite add(); we can simply do something like:
    (pseudo-code)
    if(//null value//) throw error;
    add() (which refers to the super.add())
We also noted that using the javadoc of ArrayList is really helpful as Mr.K suggested.

