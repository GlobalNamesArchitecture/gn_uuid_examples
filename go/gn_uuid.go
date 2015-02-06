package main

import (
  "fmt"
  "os"
  "github.com/satori/go.uuid"
)

func main() {
  scientifi_name := os.Args[1]
  gn_name_space := uuid.NewV5(uuid.NamespaceDNS, "globalnames.org")
  gn_uuid := uuid.NewV5(gn_name_space, scientifi_name)
  fmt.Println("Scientific name: " + scientifi_name)
  fmt.Printf("GlobalNames UUID: %s\n", gn_uuid)
}
