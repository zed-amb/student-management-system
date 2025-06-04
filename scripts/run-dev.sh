#!/bin/bash

echo "🚀 Starting MySQL and Kafka containers for local development..."

# Navigate to the infra/docker directory
cd "$(dirname "$0")/../infra/docker" || exit

# Start docker-compose
docker-compose up -d

echo "✅ Containers started."
echo ""

# Show container statuses
docker-compose ps

echo ""
echo "📦 Available Containers:"
docker ps --filter "name=mysql" --filter "name=kafka" --filter "name=zookeeper"

echo ""
echo "📋 Tail logs? Press Ctrl+C to stop."
docker-compose logs -f
