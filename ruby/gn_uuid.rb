#!/usr/bin/env ruby

require_relative "lib/uuid"

scientific_name = ARGV[0]
gn_namespace = UUID.parse("90181196-fecf-5082-a4c1-411d4f314cda")
gn_uuid = UUID.create_v5(scientific_name, gn_namespace)

puts "Scientific name: #{scientific_name}"
puts "GlobalNames UUID: #{gn_uuid.to_s}"

