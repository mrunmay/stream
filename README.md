Stream concepts
---------------------
    stream()
    
    filter()
        filter(predicate)
            input --> 10 elements
            output --> <=10 elements
    
    map()
        map(function)
            input --> 10 elements
            output --> 10 elements

    collect()

    count()

    sorted()
        *  Comparable : Default natural sorting order
        ** Comparator : Customize your sorting order

        *  Default is in Ascending order
        ** For customized Descnding Order(**)
            . returns +ve if and only obj1 has to come after obj2
            . returns -ve if and only obj1 has to come before obj2
            . returns 0 if and only obj1 & obj2 are same
            
        Natural sorting order           =   (i1, i2) -> i1.compareTo(i2)
        Reverse of atural sorting order =   (i1, i2) -> i2.compareTo(i1)
        Reverse of atural sorting order =   (i1, i2) -> -i1.compareTo(i2)

    min()
    [5,3,10,15,4]
    [3,4,5,10,15] -> Ascedening Order
            Min element = 3
            Max element = 15
    
    max()
    [5,3,10,15,4]
    [15,10,5,4,3] -> Descending Order
            Min element = 15
            Max element = 3
            
     forEach()
            
     toArray()
        To convert stream of objects into array
        Array performance wise too good when compare with Collection concepts
        
     Stream.of()