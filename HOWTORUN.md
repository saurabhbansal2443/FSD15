# How to Run Java Programs

## Method 1: Using VS Code Run Button (Recommended)

1. Open any `.java` file in VS Code
2. Click the **"Run" button** (▶️ icon) at the top right
3. Select a configuration:
   - `Run Implementation` - runs linked.Implementation
   - `Run linked.Link` - runs linked.Link

## Method 2: Using Terminal Script

```bash
./run.sh linked.Implementation
```

Other examples:
```bash
./run.sh array.Basics
./run.sh recursion.Factorial
```

## Method 3: Using Command Line

```bash
# Compile all
javac -d bin -sourcepath src $(find src -name "*.java")

# Run
java -cp bin linked.Implementation
```

## Important: Before Running

Make sure you're in the correct directory:
```bash
cd /Users/saurabhbansal/Desktop/FSD\ 12\ Coding\ Thinker\ 
```

## Current Setup

- **Source files**: `src/` directory
- **Compiled files**: `bin/` directory
- **Main class**: `linked.Implementation`
- **VS Code**: Configured for automatic detection

## Troubleshooting

If run button doesn't work:
1. Close and reopen VS Code
2. Run build task: `Cmd+Shift+B`
3. Then click Run button again

