// items on the left hand side are called KEYS
// items on the right hand side are called Values
// the key value pair is called an entry

//each key is unique
// but the values can be duplicated


fun main() {
    val association = Pair("Nail", "Hammer")

    // .first property is used to get the first element
    association.first // Nail
    // .second property is used to get the first element
    association.second // Hammer

    val toolbox = mapOf(
        "Nail" to "Hammer",
        "Hex Nut" to "Wrench",
        "Hex Bolt" to "Wrench",
        "Slotted Screw" to "Slotted Screwdriver",
        "Phillips Screw" to "Phillips Screwdriver",
    )

    println(toolbox)

    // to get values there are different ways
    val tool = toolbox.get("Nail") // or toolbox["Nail"] OR toolbox.getValue("Nail") OR toolbox.getOrDefault("smth","smth")

    //Modifying
    val mutableToolbox = mutableMapOf(
        "Nail" to "Hammer",
        "Hex Nut" to "Wrench",
        "Hex Bolt" to "Wrench",
        "Slotted Screw" to "Slotted Screwdriver",
        "Phillips Screw" to "Phillips Screwdriver",
    )

    // to addd a new entry use .put -------> just like .get() for lists and sets
    mutableToolbox.put("Lumber", "Saw") // mutableToolbix["Lumber"] = "Saw" is better

    // edit existing
    mutableToolbox["Hex Bolt"] = "Nut Driver"

    // use .remove to remove
    mutableToolbox.remove("Lumber")
    // although we can change the value of an entry we cannot change the key.
    // only way is to delete and add a new entry


    //OPERATIONS
    // ForEach
    toolbox.forEach{ entry ->
        println("Use a ${entry.value} on a ${entry.key}")
    }
    // filtering
    val screwdrivers = toolbox.filter { entry ->
        entry.value.contains("Screwdriver")
    }
    // mappping
    val newToolbox = toolbox
        .mapKeys { entry -> entry.key.replace("Hex", "Flange")  }
        .mapValues { entry -> entry.value.replace("Wrench", "Ratchet")  }

}