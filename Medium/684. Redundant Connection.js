
const findRedundantConnection = (edges) => {
    const leaves = edges.flat().filter((v, i, a) => a.indexOf(v) === a.lastIndexOf(v));
    if (leaves.length) {
        return findRedundantConnection(edges.filter(([a, b]) => !leaves.includes(a) && !leaves.includes(b)));
    }
    return edges.at(-1);
};