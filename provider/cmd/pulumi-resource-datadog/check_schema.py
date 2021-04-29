import json

def check(f):
    print(f)
    with open(f, 'r') as fp:
        j = json.load(fp)
        d = j['resources']['datadog:index/dashboard:Dashboard']
        d['description'] = f'{d["description"][0:100]} .. ({len(d["description"])})'

        print(json.dumps(d, indent=True))


check('schema.json')
# check('/Users/anton/pulumi-datadog-2/provider/cmd/pulumi-resource-datadog/schema.json')
