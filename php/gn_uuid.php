<?php

require("UUID.php");

$scientific_name = $argv[1];
$gn_uuid = UUID::v5("90181196-fecf-5082-a4c1-411d4f314cda", $scientific_name);
print("Scientific name: " . $scientific_name . "\n");
print("GlobalNames UUID: " . $gn_uuid . "\n"); 
