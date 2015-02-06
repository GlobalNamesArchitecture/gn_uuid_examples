#!/usr/bin/env python

import uuid
import sys
scientific_name = sys.argv[1]
gn_namespace = uuid.UUID("{90181196-fecf-5082-a4c1-411d4f314cda}")
gn_uuid = uuid.uuid5(gn_namespace, scientific_name)
print("Scientific name: %s" % scientific_name)
print("GlobalNames UUID: %s" %  gn_uuid)
