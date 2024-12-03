fetch("output.json")
  .then((response) => response.json())
  .then((data) => {
    console.log(data); // Log the JSON data
    const rect = generateRectangleFromJson(data);
    console.log(rect);

    const svg = `<svg width="200" height="200" xmlns="http://www.w3.org/2000/svg">${rect}</svg>`;

    document.getElementById("svg").innerHTML = svg;
    generateRectangleFromJson(data);
  })
  .catch((error) => console.error("Error fetching JSON:", error));

function generateRectangleFromJson(jsonData) {
  const defaultAttributes = {
    x: "10",
    y: "10",
    width: "100",
    height: "50",
    fill: "blue",
  };

  const shapeData = jsonData[0]; // Assuming the input is an array

  if (shapeData.action === "create" && shapeData.shape === "Rectangle") {
    // Start building the rectangle as a string
    const attributes = Object.entries(defaultAttributes)
      .map(([key, value]) => `${key}="${value}"`)
      .join(" ");

    // Add optional `name` as an id
    const id = shapeData.name ? `id="${shapeData.name}"` : "";

    return `<rect ${id} ${attributes}></rect>`;
  }

  return "";
}
